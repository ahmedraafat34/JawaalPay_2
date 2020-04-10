package com.example.jawwal_pay;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Pay extends AppCompatActivity {

    public  String Paymentkey;
    public String URL ="";
    public int IframeID;
    public String Endpoint="";
    String success ="";
    String Id = "";
    String amount_cents ="";
    String trx_response_code="";

    public void StartPayment(String paymentkey , int iframeID){



        WebView mywebview = (WebView) findViewById(R.id.webview);
        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.setWebViewClient(new WebViewClient(){
            @SuppressWarnings("deprecation")
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;

            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);

                if (view.getOriginalUrl().contains(Endpoint)){
                    URL = view.getOriginalUrl();
                    Uri uri = Uri.parse(URL);

                    success = uri.getQueryParameter("success");
                    Id = uri.getQueryParameter("id");
                    amount_cents = uri.getQueryParameter("amount_cents");
                    trx_response_code = uri.getQueryParameter("txn_response_code");

                    Intent result = new Intent();
                    result.putExtra("success",success);
                    result.putExtra("ID",Id);
                    result.putExtra("amount_cents", amount_cents);
                    result.putExtra("trx_response_code",trx_response_code);

                    setResult(RESULT_OK,result);
                    finish();


                }
            }
        });
        mywebview.getSettings().setLoadWithOverviewMode(true);
        mywebview.getSettings().setUseWideViewPort(true);
        mywebview.getSettings().setSupportZoom(true);
        mywebview.getSettings().setBuiltInZoomControls(false);
        mywebview.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        mywebview.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        mywebview.getSettings().setDomStorageEnabled(true);
        mywebview.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        mywebview.setScrollbarFadingEnabled(true);

        if (Build.VERSION.SDK_INT < 18){

            mywebview.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        }
mywebview.loadUrl("https://accept.paymobsolutions.com/api/acceptance/iframes/"+IframeID + "?payment_token="+Paymentkey);

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pay);
        Intent intent = getIntent();
        Paymentkey = intent.getStringExtra(IntentKeys.PAYMENT_KEY);
        IframeID = intent.getIntExtra(String.valueOf(IntentKeys.IFRAMEID),1);
        Endpoint = intent.getStringExtra(IntentKeys.ENDPOINT_URL);

        StartPayment(Paymentkey,IframeID);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            Runtime.getRuntime().gc();
            finish();
        }catch (Exception e){

            e.printStackTrace();
        }
    }
}

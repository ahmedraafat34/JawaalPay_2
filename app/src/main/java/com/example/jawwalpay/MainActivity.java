package com.example.jawwalpay;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jawwal_pay.IntentKeys;
import com.example.jawwal_pay.Pay;

public class MainActivity extends AppCompatActivity {
//    String Endpoint = "https://accept.paymobsolutions.com/api/acceptance/post_pay";
//    public int IframeID =7898;
//    String paymentkey= "ZXlKaGJHY2lPaUpJVXpVeE1pSXNJblI1Y0NJNklrcFhWQ0o5LmV5SnBiblJsWjNKaGRHbHZibDlwWkNJNk5EZzFPQ3dpYkc5amExOXZjbVJsY2w5M2FHVnVYM0JoYVdRaU9tWmhiSE5sTENKd2JXdGZhWEFpT2lJME1TNHlNelF1TWpBM0xqRTBOeUlzSW1OMWNuSmxibU41SWpvaVJVZFFJaXdpWW1sc2JHbHVaMTlrWVhSaElqcDdJbVpwY25OMFgyNWhiV1VpT2lKRGJHbG1abTl5WkNJc0lteGhjM1JmYm1GdFpTSTZJazVwWTI5c1lYTWlMQ0p6ZEhKbFpYUWlPaUpGZEdoaGJpQk1ZVzVrSWl3aVluVnBiR1JwYm1jaU9pSTRNREk0SWl3aVpteHZiM0lpT2lJME1pSXNJbUZ3WVhKMGJXVnVkQ0k2SWpnd015SXNJbU5wZEhraU9pSktZWE5yYjJ4emEybGlkWEpuYUNJc0luTjBZWFJsSWpvaVZYUmhhQ0lzSW1OdmRXNTBjbmtpT2lKRFVpSXNJbVZ0WVdsc0lqb2lZMnhoZFdSbGRIUmxNRGxBWlhoaExtTnZiU0lzSW5Cb2IyNWxYMjUxYldKbGNpSTZJaXM0TmlnNEtUa3hNelV5TVRBME9EY2lMQ0p3YjNOMFlXeGZZMjlrWlNJNklqQXhPRGs0SWl3aVpYaDBjbUZmWkdWelkzSnBjSFJwYjI0aU9pSk9RU0o5TENKdmNtUmxjbDlwWkNJNk5EZzFPVEkxT0N3aVpYaHdJam94TlRnMk5URXpOREEzTENKMWMyVnlYMmxrSWpvek5UVTFMQ0poYlc5MWJuUmZZMlZ1ZEhNaU9qRXdNSDAuSTFpTDRiWkxDaUkwR3g3SWZWemFkMzgtVV91MzdGT1lpQ2dwVGUxOVhxVUNKUWtrNjVfcWNEa2NXYWpOTFY2UDdubDNibGJUQzZ2MW5WdmU1S1hvWFE=";
//    String amount_cents="";
//    String Id = "";
//    String txn_response_code="";
//    String sucess;

    public void StartPayActivity(){

//        Intent pay_intent = new Intent(this, Pay.class);
//        pay_intent.putExtra(IntentKeys.PAYMENT_KEY, paymentkey);
//        pay_intent.putExtra(IntentKeys.ENDPOINT_URL,Endpoint);
//        pay_intent.putExtra(String.valueOf(IntentKeys.IFRAMEID),IframeID);
//
//        startActivityForResult(pay_intent,1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      StartPayActivity();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

//        if (requestCode == 1){
//            if (resultCode == RESULT_OK){
//
//                sucess = data.getStringExtra("success");
//                Id = data.getStringExtra("ID");
//                amount_cents = data.getStringExtra("amount_cents");
//                txn_response_code = data.getStringExtra("trx_response_code");
//
//            }
//        }
    }
}

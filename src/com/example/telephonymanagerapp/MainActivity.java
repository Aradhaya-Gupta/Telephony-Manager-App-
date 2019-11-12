package com.example.telephonymanagerapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends Activity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView1);
        TelephonyManager tm=(TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        String  IMEINUMBER = tm.getDeviceId();
        String Subscriberid = tm.getSubscriberId();
        String simserialnumber = tm.getSimSerialNumber();
        String Networkcountryiso = tm.getNetworkCountryIso();
        String simcountryiso=tm.getSimCountryIso();
        String networkoperator = tm.getNetworkOperator();
        String simoperator= tm.getSimOperator();
		String networkoperatorname = tm.getNetworkOperatorName();
        String simoperatorname = tm.getSimOperatorName();
        String softwareversion = tm.getDeviceSoftwareVersion();
        String voicemailnumber = tm.getVoiceMailNumber();
        String strphonenetworktype="";
        int phonetype = tm.getPhoneType();
        switch ((phonetype)) {
		case TelephonyManager.PHONE_TYPE_CDMA:
			strphonenetworktype = "CDMA";
			break;
		case TelephonyManager.PHONE_TYPE_GSM:
			strphonenetworktype = "GSM";
			break;
		case TelephonyManager.PHONE_TYPE_NONE:
			strphonenetworktype = "NONE";
			break;

		default:
			break;
			
		}
        boolean isroming=tm.isNetworkRoaming();
		
        String info = "Your Phone detail is :\n"+
        "\n IMEINUMBER: "+IMEINUMBER+
        "\n Subscriberid: "+Subscriberid+
        "\n simserialnumber: "+simserialnumber+
        "\n networkcountryiso: "+Networkcountryiso+
        "\n simcountryiso: "+simcountryiso+
        "\n networkoperator: "+networkoperator+
        "\n simoperator: "+simoperator+
        "\networkoperatername: "+networkoperatorname+
        "\n simoperatorname: "+simoperatorname+
        "\n softwareversion:"+softwareversion+
        "\n voicemailnumber:"+voicemailnumber+
        "\n inroming?:"+isroming;
		
        tv.setText(info);
    }

   
}

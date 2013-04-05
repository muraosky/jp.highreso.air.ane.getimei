package jp.highreso.air.android.getimei;

import android.app.Activity;
import android.telephony.TelephonyManager;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class GetIMEIFunc implements FREFunction{
    @Override
    public FREObject call(FREContext arg0, FREObject[] arg1)
    {
		FREObject returnedValue;
        try{
    		// IMEIŽæ“¾
    		TelephonyManager telephonyManager = (TelephonyManager)arg0.getActivity().getSystemService(Activity.TELEPHONY_SERVICE);
    		String imei = telephonyManager.getDeviceId();
        	
        	returnedValue = FREObject.newObject(imei);
        }catch(Exception e){
			e.printStackTrace();
			returnedValue = null;
        }
        return returnedValue;
    }

}

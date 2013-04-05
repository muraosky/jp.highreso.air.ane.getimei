package jp.highreso.air.android.getimei;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
import com.adobe.fre.FREFunction;

public class GetIMEIMain implements FREExtension {
    public FREContext createContext(String arg)
    {

        FREContext context = new FREContext()
        {
            @Override
            public Map<String, FREFunction> getFunctions()
            {
                Map<String, FREFunction> result = new HashMap<String, FREFunction>();

                result.put( "getIMEI", new GetIMEIFunc() );

                return result;
            }

            @Override
            public void dispose(){  }
        };
        return context;
    }

    public void initialize(){   }
    public void dispose(){  }

}

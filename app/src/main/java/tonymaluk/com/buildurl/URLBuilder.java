package tonymaluk.com.buildurl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Tony on 06.04.2017.
 */

public class URLBuilder {
    //transfer to method your args in Map collection.
    public String build(HashMap maps) throws UnsupportedEncodingException {

        String completeURI = "";
        int size;
        int index = 0;

        Set<Map.Entry<String, String>> set = maps.entrySet();//entry to Set your data with key and value.
        size = maps.size();
        for (Map.Entry<String, String> data : set){
            ++index;
            String delimiter = "&";//paste delimeter '&' between args.
            if(index == size){
                delimiter = "";//if args ends don't set delimiter.
            }
            completeURI = completeURI + data.getKey() + "=" + URLEncoder.encode(data.getValue(), "UTF-8") + delimiter;//build complete URL in UTF-8.
        }
        return completeURI;
    }
}

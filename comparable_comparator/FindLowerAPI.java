package com.sys.comparable_comparator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FindLowerAPI implements Comparable<FindLowerAPI>{

	private String appName;
	private String apiName;
	private int version;
	
	public FindLowerAPI() {
		 
	}
	
	public FindLowerAPI(String appName, String apiName, int version)
	{
		this.appName = appName;
		this.apiName = apiName;
		this.version = version;
	}
	
	public String getAppName() {
		return appName;
	}
	public String getApiName() {
		return apiName;
	} 
	public int getVersion() {
		return version;
	} 
	public static List readAPIFile()
	{
		List<FindLowerAPI> apiList = new ArrayList<FindLowerAPI>();
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("api_list.txt")));
			
			String api;
			
			while((api = br.readLine()) != null)
			{
				String splits[] = api.split(",");
				apiList.add(new FindLowerAPI(splits[0], splits[1], Integer.parseInt(splits[2].substring(2, splits[2].length()))));		
			}
			br.close();
			
		}catch(Exception e)
		{
			System.err.println(e);
		} 
		return apiList;
	}

	public static void main(String[] args) {
		try{
			List<FindLowerAPI> list = readAPIFile(); //To collect raw data from file & store in the Object List
			//Collections.sort(list); // To sort the API List Object 
			Map<String, List> map = new TreeMap<String,List>();
		
			for(FindLowerAPI api:list)
			{
				if(map != null & map.size()>0)
				{
					List<FindLowerAPI> keyList = map.get(api.getAppName());
					if(keyList != null)
					{
						keyList.add(api);
						map.put(api.getAppName(), keyList);
					}
	
				}
				else
				{
					List<FindLowerAPI> apiList = new ArrayList<FindLowerAPI>();
					apiList.add(api);
					map.put(api.getAppName(), apiList);
				}
			}
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt",true)));
			Set keySet = map.keySet();
			for(Object appNameFromMap : keySet)
			{
				String key = (String)appNameFromMap;
				
				List<FindLowerAPI> finalList = map.get(key);
				
				if(finalList.size() > 1)
				{
					Collections.sort(finalList);
					//System.out.println(key);
					bw.write(key);
				}
				
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

		
	}

	@Override
	public int compareTo(FindLowerAPI obj) {
		//return (this.appName.compareTo(obj.appName));
		return (this.version - obj.version);
	}

}

package com.group5.factory;

import org.json.JSONException;
import org.json.JSONObject;

import com.group5.bean.Product;
import com.group5.bean.SalesBeanList;

public class ProductFactory implements Factory {
	/**
	 * 
	 * "description":"fuirNode","name":"orange","barcode":0,"uuid":
	 * "792617824d8d11e4b1b6b870f44afbf0"
	 * 
	 * */
	@Override
	public Product createBean(JSONObject jo) {
		// TODO Auto-generated method stub
		Product product = new Product();
		try {
			product.setUuid(jo.getString("uuid"));
			product.setDescription(jo.getString("description"));
			product.setName(jo.getString("name"));
			product.setBarcode(jo.getLong("barcode"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public SalesBeanList createBeanList(JSONObject jo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getJsonDataBySalesBeanList(SalesBeanList sbl) {
		// TODO Auto-generated method stub
		return null;
	}

}

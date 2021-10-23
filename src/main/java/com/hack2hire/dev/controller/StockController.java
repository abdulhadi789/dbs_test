package com.hack2hire.dev.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController("/stock")
public class StockController {

	@GetMapping(value="/history/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public String  getHistorydatabytickerID(){
		
		return "";
	}
	
	@GetMapping(value="/alltickers",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List  getAlltickers(){
		
		return Collections.EMPTY_LIST;
	}
	
	@GetMapping(value="/live/latesttickers/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public String  getLatestTickersByID(){
		
		return null;
	}
	
	@GetMapping(value="/live/latesttickers",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List  getLatestTickersList(){
		
		return Collections.EMPTY_LIST;
	}
	
}

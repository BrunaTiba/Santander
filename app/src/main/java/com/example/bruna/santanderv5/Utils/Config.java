package com.example.bruna.santanderv5.Utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.bruna.santanderv5.Model.Fund.Info;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

//public class Config {

//   private Context mContext;
 //  private ArrayList<Info> infos;
 // private RecyclerView.Adapter adapter;
  // private RecyclerView recyclerView;

 //  public Config(Context context) {
 //       this.mContext = context;

//   }
//
//   public static final String URL_CELLS = "https://floating-mountain-50292.herokuapp.com/cells.json";
//    public static final String URL_FUND = "https://floating-mountain-50292.herokuapp.com/fund.json";


//   public void ToRquestFund() {


//        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_FUND,
  //              new Response.Listener<String>() {
    //                @Override
      //              public void onResponse(String response) {
        //                ProgressDialog progressDialog = new ProgressDialog(mContext);
          //              progressDialog.dismiss();
  //                      try {
  //                          JSONObject jsonObject = new JSONObject(response);
  //                          JSONObject array = jsonObject.getJSONObject("screen");
//
                          // for (int i = 0; i<array.length(); i++) {
//                                //JSONObject object = array.getJSONObject();     //    Info info = new Info(
                            //            object.getString("name"),
                          //              object.getString("data")
                         //       );
                         //       infos.add(info);
                          //  }

 //                       } catch (JSONException e) {
//                            e.printStackTrace();
//                       }
//
//                    }
 //               },
  //              new Response.ErrorListener() {
  //                  @Override
 //                   public void onErrorResponse(VolleyError error) {
  //                      ProgressDialog progressDialog = new ProgressDialog(mContext);
//                        progressDialog.dismiss();
//                        Toast.makeText(mContext, error.getMessage(), Toast.LENGTH_LONG).show();
//                    }
 //               });

 //       RequestQueue requestQueue = Volley.newRequestQueue(mContext);
 //       requestQueue.add(stringRequest);
 //   }

 //   public void ToRequestCells() {

 //       StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_CELLS,
 //               new Response.Listener<String>() {
 //                   @Override
  //                  public void onResponse(String response) {

 //                   }
  //              },
 //               new Response.ErrorListener() {
 //                  @Override
  //                  public void onErrorResponse(VolleyError error) {

 //                   }
  //              });

 //       RequestQueue requestQueue = Volley.newRequestQueue(mContext);
 //       requestQueue.add(stringRequest);
 //   }

//}

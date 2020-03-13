import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Orderdetails } from '../model/orderdetails';

@Injectable({
  providedIn: 'root'
})
export class OrderdetailsService {
  baseUrl: string;

  constructor(private httpClient: HttpClient) {
    this.baseUrl = "http://localhost:9200/orderdetails";
  }


  add(cart: string) :Observable<Orderdetails> {
    console.log(localStorage.getItem('cart'));
    return this.httpClient.post<Orderdetails>(this.baseUrl,cart);
  }
  //  add(pay:Payment):Observable<Payment>{
  //   return this.httpClient.post<Payment>(this.baseUrl,pay);
  // }
}

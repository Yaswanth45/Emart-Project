import { Injectable } from '@angular/core';
import { Product } from '../entities/product.entity';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  public products: Product[];
  constructor() {
    this.products = [
      { id: 'p1', name: 'Rounded Hat', price: 600, photo: 'assets/img/insta-2.jpg'},
      { id: 'p2', name: 'Gray Rounded T-shirt', price: 200, photo: 'assets/img/insta-5.jpg' },
      { id: 'p3', name: 'Round Printed black T-shirt ', price: 300, photo: 'assets/img/blog/kids2.jpg' },
      { id: 'p4', name: 'Kids Frock', price: 200, photo: 'assets/img/blog/kids1.jpg' },
      { id: 'p5', name: 'Sweat T-shirt for Women', price: 300, photo: 'assets/img/insta-3.jpg' },
      { id: 'p6', name: 'Jeans Shirt for Parties', price: 500, photo: 'assets/img/blog/mens4.jpg' },
      { id: 'p7', name: 'Black Blazzer ', price: 2000, photo: 'assets/img/blog/mens6.jpg' },
      { id: 'p8', name: 'Red Frock', price: 1000, photo: 'assets/img/blog/kids5.jpg' },
      { id: 'p9', name: 'Rapid Runner IDP Running Shoes For Men ', price: 1500, photo: 'assets/img/insta-4.jpg' }

  ];
}


findAll(): Product[] {
  return this.products;
}

find(id: string): Product {
  return this.products[this.getSelectedIndex(id)];
}

public getSelectedIndex(id: string) {
  for (var i = 0; i < this.products.length; i++) {
      if (this.products[i].id == id) {
          return i;
      }
  }
  return -1;
}

}


   
  

  

  




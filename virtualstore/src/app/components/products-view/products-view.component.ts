
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppService } from 'src/app/app.service';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs'
import { Product } from 'src/app/components/model/product';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-products-view',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './products-view.component.html',
  styleUrls: ['./products-view.component.css']
})

export class ProductsViewComponent  implements OnInit {


  private url = "http://localhost:3005/products";


  //
  products : any [] | undefined

  
  
  constructor(private http: HttpClient, private router: Router) { 

    this.getProducts().subscribe(data =>{
      this.products = data;
      console.log("RESULT " +data);
    })
   }

  getProducts(): Observable<any[]>{
    return this.http.get<any[]>(this.url)
  }

  
  addproduct(product: Product){
    return this.http.post<Product>(`${this.url}add`, product)
  }

  
  updateProduct(id?: number ,product?: any): Observable<any>{
    return this.http.put<any>(`${this.url}update/${id}`, product)
  }

 
  deleteProduct(id: number): Observable<any>{
    return this.http.delete<any>(`${this.url}delete/${id}`)
  }
  

  ngOnInit(): void {
   
    throw new Error('Method not implemented.');
  }

}

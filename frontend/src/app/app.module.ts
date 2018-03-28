import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { UnacceptedStoresComponent } from './unaccepted-stores/unaccepted-stores.component';
import {StoreService} from "./services/store/store.service";
import {UserService} from "./services/user/user.service";
import {ProductService} from "./services/product/product.service";
import {BrandService} from "./services/brand/brand.service";
import {CategoryService} from "./services/category/category.service";
import {HttpModule} from "@angular/http";
import { MainComponent } from './main/main.component';
import { AddProductToStoreComponent } from './add-product-to-store/add-product-to-store.component';
import { AddProductToSystemComponent } from './add-product-to-system/add-product-to-system.component';


@NgModule({
  declarations: [
    AppComponent,
    UnacceptedStoresComponent,
    MainComponent,
    AddProductToStoreComponent,
    AddProductToSystemComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule
  ],
  providers: [StoreService, UserService, ProductService, BrandService, CategoryService],
  bootstrap: [AppComponent]
})
export class AppModule { }

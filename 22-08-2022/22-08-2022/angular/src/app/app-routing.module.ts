import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { take } from 'rxjs';
import { Comp1Component } from './comp1/comp1.component';
import { Comp2Component } from './comp2/comp2.component';
import { TableComponent } from './table/table.component';

const routes: Routes = [
 { path:'home', component:Comp1Component},
 { path:'about', component:Comp2Component },
 { path:'table', component:TableComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

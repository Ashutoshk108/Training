import { Component, OnInit } from '@angular/core';

interface students {  
  id: Number;  
  name: String;  
  email: String;  
  gender: String;  
}  




@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {

  
  student:students[]=
    [  
      
      
      {  
        "id": 1,  
        "name": "Jack",  
        "email": "jack@gmail.com",  
        "gender": "male"  
      },  
      {  
        "id": 2,  
        "name": "Peter",  
        "email": "peter@gmail.com",  
        "gender": "male"  
      },  
      {  
        "id": 3,  
        "name": "Mary",  
        "email": "mary@gmail.com",  
        "gender": "female"  
      },  
      {  
        "id": 4,  
        "name": "Smith",  
        "email": "smith@gmail.com",  
        "gender": "male"  
      },  
      {  
        "id": 5,  
        "name": "John",  
        "email": "john@gmail.com",  
        "gender": "male"  
      }  
    ] 
  
  constructor() {
    
  }

 ngOnInit(): void {
 }
}

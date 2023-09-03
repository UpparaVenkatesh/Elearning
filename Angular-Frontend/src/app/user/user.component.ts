import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  SessionValue : string ="";
  constructor() { }

  ngOnInit(): void {
   this.SessionValue = sessionStorage.getItem("Username");
  }

}

import { Component, OnInit } from '@angular/core';
import { NgserviceService } from '../ngservice.service';
@Component({
  selector: 'app-myprofile',
  templateUrl: './myprofile.component.html',
  styleUrls: ['./myprofile.component.css']
})
export class MyprofileComponent implements OnInit {

  user :any;
  SessionValue : string ="";
  constructor(private _service:NgserviceService) { }

  ngOnInit(): void {
    
    this.getUser();
   
}

getUser() {
  this.SessionValue = sessionStorage.getItem("Username");
  return this._service.getuser(this.SessionValue)
  .subscribe(
    data => {
      this.user = data;
    }, error => {
      console.log(error);
    }
  );
}




}

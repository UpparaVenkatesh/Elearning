import { Component, OnInit } from '@angular/core';
import { NgserviceService } from '../ngservice.service';
@Component({
  selector: 'app-viewusers',
  templateUrl: './viewusers.component.html',
  styleUrls: ['./viewusers.component.css']
})
export class ViewusersComponent implements OnInit {

  users :any;
  
  constructor(private _service:NgserviceService) { }
  ngOnInit(): void {
    let response = this._service.fetchUserListFromRemote();
    response.subscribe(data => this.users = data);
   
}
}

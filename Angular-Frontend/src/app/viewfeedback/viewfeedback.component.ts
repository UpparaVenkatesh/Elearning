import { Component, OnInit } from '@angular/core';
import { NgserviceService } from '../ngservice.service';
@Component({
  selector: 'app-viewfeedback',
  templateUrl: './viewfeedback.component.html',
  styleUrls: ['./viewfeedback.component.css']
})
export class ViewfeedbackComponent implements OnInit {

  feedback :any;
  
  constructor(private _service:NgserviceService) { }
  ngOnInit(): void {
    let response = this._service.fetchFeedbackListFromRemote();
    response.subscribe(data => this.feedback = data);
   
}
}

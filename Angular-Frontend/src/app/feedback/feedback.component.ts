import { Component, OnInit } from '@angular/core';
import { NgserviceService } from '../ngservice.service';
import { Feedback } from '../feedback'; 
@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit {

  users:Feedback=new Feedback(0,"","","","");
  message:any;

  constructor(private service:NgserviceService) { }

  ngOnInit(): void {
  }
  public addfeedback()
  {
    let response=this.service.saveFeedback(this.users);
    response.subscribe(data=>
      {  alert("Feedback added successfully.");
    });
  }

}

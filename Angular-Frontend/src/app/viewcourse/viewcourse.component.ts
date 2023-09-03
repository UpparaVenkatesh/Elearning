import { Component, Input, OnInit } from '@angular/core';
import { NgserviceService } from '../ngservice.service';

@Component({
  selector: 'app-viewcourse',
  templateUrl: './viewcourse.component.html',
  styleUrls: ['./viewcourse.component.css']
})
export class ViewcourseComponent implements OnInit {


  courses :any;
  SessionValue : string ="";
  imgPath : string = "../assets/img/course/";
  format : string = ".jpg";
  constructor(private _service:NgserviceService) { }

  ngOnInit(): void {
    let response = this._service.fetchCourseListFromRemote();
    response.subscribe(data => this.courses = data);
 this.SessionValue = sessionStorage.getItem("Username");
}

enroll(id: number,course_name: string,course_des: string,course_fees: string,image : string, cfile:string) {
  this.SessionValue = sessionStorage.getItem("Username");
    let response=this._service.enrolldata(id,course_name,course_des,course_fees,this.SessionValue,image,cfile);
    response.subscribe(data=>
      {  alert("Enrollment  successfull.");
    });
  }
  


  


}

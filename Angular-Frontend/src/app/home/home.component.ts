import { Component, OnInit } from '@angular/core';
import { NgserviceService } from '../ngservice.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  
  
  courses :any;
  SessionValue : string ="";
  imgPath : string = "../assets/img/course/";
  format : string = ".jpg";
  constructor(private _service:NgserviceService,private router: Router) { }

  ngOnInit(): void {
    let response = this._service.fetchCourseListFromRemote();
    response.subscribe(data => this.courses = data);
    this.SessionValue = sessionStorage.getItem("Username");
    if(this.SessionValue == null ){
      this.router.navigate(['auth/login']);
    }
  }

  enroll(id: number,course_name: string,course_des: string,course_fees: string,image : string, cfile:string) {
    this.SessionValue = sessionStorage.getItem("Username");
      let response=this._service.enrolldata(id,course_name,course_des,course_fees,this.SessionValue,image,cfile);
      response.subscribe(data=>
        {  alert("Enrollment  successfull.");
      });
    }
}

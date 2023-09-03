import { Component, OnInit } from '@angular/core';
import { NgserviceService } from '../ngservice.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-mycourse',
  templateUrl: './mycourse.component.html',
  styleUrls: ['./mycourse.component.css']
})
export class MycourseComponent implements OnInit {
   cid :any;
  course :any;
  SessionValue : string ="";
  imgPath : string = "../assets/img/course/";
  format : string = ".jpg";
  constructor(private _service:NgserviceService,private router: Router) { }
  ngOnInit(): void {

    this.getmyCourse();
  }


  getmyCourse() {
    this.SessionValue = sessionStorage.getItem("Username");
    return this._service.getmycourse(this.SessionValue)
    .subscribe(
      data => {
        this.course = data;
      }, error => {
        console.log(error);
      }
    );
  }

  play(cid){
    this.router.navigate(['user/playcourse']);
    sessionStorage.setItem("Courseid",cid);
  }







}

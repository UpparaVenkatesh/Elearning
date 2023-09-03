import { Component, OnInit } from '@angular/core';
import { NgserviceService } from '../ngservice.service';
import { Product } from '../product'; 
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-course',
  templateUrl: './course.component.html',
  styleUrls: ['./course.component.css']
})
export class CourseComponent implements OnInit {

  users:Product=new Product(0,"","",0,"","");
  message:any;
  SessionValue : string ="";
  constructor(private service:NgserviceService,private router: Router) { }

  ngOnInit(): void {
    this.SessionValue = sessionStorage.getItem("Username");
    if(this.SessionValue == null ){
      this.router.navigate(['auth/login']);
    }
  }
  public add1()
  {
    let response=this.service.saveCourse(this.users);
    response.subscribe(data=>
      {  alert("course added successfully.");
    });
  }

}



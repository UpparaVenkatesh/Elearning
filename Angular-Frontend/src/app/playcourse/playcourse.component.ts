import { Component,  OnInit, ViewChild } from '@angular/core';
import { NgserviceService } from '../ngservice.service';

@Component({
  selector: 'app-playcourse',
  templateUrl: './playcourse.component.html',
  styleUrls: ['./playcourse.component.css']
})
export class PlaycourseComponent implements OnInit {
  resource :any;
  SessionValue : string ="";
   imgPath:string = "../assets/img/course/";
  vformat:string = ".mp4";
  playVideo(event) {
    event.toElement.play()
  }

  constructor(private _service:NgserviceService) { }

  ngOnInit(): void {
    this.getresource();
  }



  getresource() {
    this.SessionValue = sessionStorage.getItem("Courseid");
    return this._service.getresource(this.SessionValue)
    .subscribe(
      data => {
        this.resource = data;
      }, error => {
        console.log(error);
      }
    );
  }


}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  constructor(private router: Router) { }


  sysUser:any;
  sysPass:any;
  user:any;

  ngOnInit(): void {
  }
  loginAdmin()
  {
    if(this.sysUser=="AdminMphasis" && this.sysPass=="Admin@1234")
    {
    this.router.navigate(['admin/home']);
    sessionStorage.setItem("Username", this.sysUser);
    }
    else 
    {
      
    this.router.navigate(['auth/adminlogin']);
    alert("Invalid username and password");
    }
  }


}

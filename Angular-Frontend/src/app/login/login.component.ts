import { Component, OnInit } from '@angular/core';
import { Register } from '../register';
import { NgserviceService } from '../ngservice.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  submitted = false;
  registerForm: any;
  registers:Register=new Register();
  res:string;
  sysuser:string="";
  sysUser:string="";
  sysPass:string="";
 
  constructor(private service: NgserviceService,private router: Router) { }

  ngOnInit(): void {
  }
  
  onSubmit() {
    this.submitted = true;

   
}
  public loginvalidat(username:string,password:string) {
    let response=this.service.loginvalidate(username,password);
    response.subscribe(data=>
      {  
        this.res= data;
        console.log(this.res);
        this.sysuser=username;
        
      if(this.res=="Success"){
          this.router.navigate(['user/home']);
          sessionStorage.setItem("Username",this.sysuser);
         }
         else{
          this.router.navigate(['auth/login']);
          alert("Invalid username and password");
         }
       
    },
    error => {
      console.log(error);
    });
  }

}
   

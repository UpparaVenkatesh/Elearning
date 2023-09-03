import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Register } from '../register';
import { NgserviceService } from '../ngservice.service';
// import custom validator to validate that password and confirm password fields match
import { MustMatch} from '../sharedservices/Must-Match';
@Component({
  selector: 'app-forgotpassword',
  templateUrl: './forgotpassword.component.html',
  styleUrls: ['./forgotpassword.component.css']
})
export class ForgotpasswordComponent implements OnInit {

 registerForm: any;
  submitted = false;
  registers:Register=new Register();
  email:any;
  password:any;
  confirmpassword:any;
  message: any;
  constructor(private formBuilder: FormBuilder,private service: NgserviceService) { }

  ngOnInit() {
      this.registerForm = this.formBuilder.group({
          password: ['', [Validators.required, Validators.pattern('(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}')]],
          confirmPassword: ['', Validators.required],
          email: ['', [Validators.required, Validators.email]],
      }, {
          validator: MustMatch('password', 'confirmPassword')
      });
      
  }

  // convenience getter for easy access to form fields
  get f() { return this.registerForm.controls; }

  onSubmit() {
      this.submitted = true;

      // stop here if form is invalid
      if (this.registerForm.invalid) {
          return;
      }
  }

  onReset() {
      this.submitted = false;
      this.registerForm.reset();
  }
  public updateEmail(email:string,password:string,confirmpassword:string) {
    this.onSubmit();
    let response=this.service.updateemail(email,password,confirmpassword);
    response.subscribe(data=>
      {  alert("Password changed  successfully.");
    });
  }
}


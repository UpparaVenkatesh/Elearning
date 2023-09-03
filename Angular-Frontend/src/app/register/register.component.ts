import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Register } from '../register';
import { NgserviceService } from '../ngservice.service';
import { MustMatch} from '../sharedservices/Must-Match';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  registerForm: any;
  submitted = false;
  registers:Register=new Register();
  
  message: any;
  constructor(private formBuilder: FormBuilder,private service: NgserviceService) { }

  ngOnInit() {
    
    this.registerForm = this.formBuilder.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      date:['',[Validators.required]],
      gender:['',[Validators.required]],
      phone:['',[Validators.required,Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]],
      username:['',[Validators.required]],
      password: ['', [Validators.required, Validators.minLength(6)]],
      confirmPassword: ['', Validators.required]
  }, {
      validator: MustMatch('password', 'confirmPassword')
  });
  }
  public createRegister() {
    this.onSubmit();
    let response=this.service.saveRegister(this.registers);
    response.subscribe(data=>
      {  alert("Registration done successfully.");
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

    //alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.registerForm.value))
}
}

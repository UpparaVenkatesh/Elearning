import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRouting } from './app.routing';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { ContactComponent } from './contact/contact.component';
import { CourseComponent } from './course/course.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
import { LoginComponent } from './login/login.component';
import { MycourseComponent } from './mycourse/mycourse.component';
import { RegisterComponent } from './register/register.component';
import { ViewcourseComponent } from './viewcourse/viewcourse.component';
import { ViewfeedbackComponent } from './viewfeedback/viewfeedback.component';
import { UserComponent } from './user/user.component';
import { AuthComponent } from './auth/auth.component';
import { MyprofileComponent } from './myprofile/myprofile.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { ViewusersComponent } from './viewusers/viewusers.component';
import { LogoutComponent } from './logout/logout.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { PlaycourseComponent } from './playcourse/playcourse.component';

const appRoutes: Routes = [
  { path: 'auth', component: AuthComponent,
  children: [
  
    { path: '', redirectTo: 'login', pathMatch: 'full' },
    { path: 'login', component: LoginComponent },
    { path: 'adminlogin', component: AdminloginComponent },
    { path: 'login/forgotpassword', component: ForgotpasswordComponent },
    { path: 'login/register', component: RegisterComponent },
    { path: 'register', component: RegisterComponent },
    { path: 'logout', component: LogoutComponent },

  ]
},
  
  
  { path: 'admin', component: AdminComponent,
    children: [
    
      { path: '', redirectTo: 'home', pathMatch: 'full' },
      { path: 'home', component: HomeComponent },
      { path: 'course', component: CourseComponent },
      { path: 'viewusers', component: ViewusersComponent },
      { path: 'viewfeedback', component: ViewfeedbackComponent },
      { path: 'logout', component: LogoutComponent },
      { path: 'login', component: LoginComponent }
    ]
  },

  { path: 'user', component: UserComponent,
    children: [
    
      { path: '', redirectTo: 'home', pathMatch: 'full' },
      { path: 'home', component: HomeComponent },
      { path: 'contact', component: ContactComponent },
      { path: 'mycourse', component: MycourseComponent },
      { path: 'feedback', component: FeedbackComponent },
      { path: 'viewcourse', component: ViewcourseComponent },
      { path: 'myprofile', component: MyprofileComponent },
      { path: 'playcourse', component: PlaycourseComponent },
      { path: 'login', component: LoginComponent },
      { path: 'logout', component: LogoutComponent },
      { path: 'login/forgotpassword', component: ForgotpasswordComponent },
      { path: 'login/register', component: RegisterComponent }
    ]
  },

  ];


@NgModule({
  declarations: [
    AppComponent,
    AppRouting,
    HomeComponent,
    AdminComponent,
    ContactComponent,
    CourseComponent,
    FeedbackComponent,
    ForgotpasswordComponent,
    LoginComponent,
    MycourseComponent,
    RegisterComponent,
    ViewcourseComponent,
    ViewfeedbackComponent,
    UserComponent,
    AuthComponent,
    MyprofileComponent,
    ViewusersComponent,
    LogoutComponent,
    AdminloginComponent,
    PlaycourseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,RouterModule.forRoot(appRoutes), FormsModule,
    HttpClientModule,ReactiveFormsModule
   
  ],
  providers: [],
  bootstrap: [AppRouting]
})
export class AppModule { }

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NgserviceService {
  private basePath = 'http://localhost:8090/';
  constructor(private http:HttpClient) { }

  public saveCourse(course:any)
  {
    return this.http.post("http://localhost:8090/addcourse",course,{responseType:"text" as "json"});
  } 



  fetchCourseListFromRemote(): Observable<any>{
    return this.http.get<any>("http://localhost:8090/getcourse");
   }


   public saveRegister(register:any)
   {
     return this.http.post("http://localhost:8090/addregister",register,{responseType:"text" as "json"});
   } 

   fetchUserListFromRemote(): Observable<any>{
    return this.http.get<any>("http://localhost:8090/getregisterList");
   }
   
   public saveFeedback(feedback:any)
   {
     return this.http.post("http://localhost:8090/addfeedback",feedback,{responseType:"text" as "json"});
   } 
 
   
  fetchFeedbackListFromRemote(): Observable<any>{
    return this.http.get<any>("http://localhost:8090/getfeedback");
   }

  
  
   public getuser(username): Observable<any> {
    return this.http.get<any>("http://localhost:8090/searchbyusername/" + "/"+ username);
  }   

  public login(username,password): Observable<any> {
    return this.http.get<any>("http://localhost:8090/loginvalidate" + "/"+ username + "/" + password);
  } 

  public enrolldata(id : any,course_name :any,course_des:any,course_fees:any,session:any,image:any,cfile:any)
  {
    return this.http.post("http://localhost:8090/enrolldata" + "/" + id + "/" + course_name + "/" + course_des + "/" + course_fees + "/" + session + "/" + image + "/" + cfile,{id,course_name,course_des,course_fees,session,image,cfile},{responseType:"text" as "json"});
  } 

  public getmycourse(username): Observable<any> {
    return this.http.get<any>("http://localhost:8090/searchmycourse/" + "/"+ username);
  }  


  public updateemail(email:any,password:any,confirmpassword:any)
  {
    return this.http.put("http://localhost:8090/searchbyemail" + "/"+ email + "/" + password +"/"+confirmpassword,{email,password,confirmpassword},{responseType:"text" as "json"});
  } 

  public loginvalidate(username:any,password:any)
  {
    return this.http.post("http://localhost:8090/loginvalidate"+ "/"+ username + "/" + password ,{username,password},{responseType:"text"})
  }

  public getresource(id): Observable<any> {
    return this.http.get<any>("http://localhost:8090/playresource/" + "/"+ id);
  }  

 

}


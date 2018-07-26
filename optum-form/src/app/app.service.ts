import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AppService {
  constructor(private http: HttpClient) { }
  submitAuthor(data) {
    console.log('hi..');
    console.log(data);
    return this.http.post('http://localhost:8080/demo', {'classId': data.ClassId, 'phoneNum': data.PhoneNumber, 'studentEmail': data.Email, 'studentName': data.StudentName}, {responseType: 'text'});
    }
  }

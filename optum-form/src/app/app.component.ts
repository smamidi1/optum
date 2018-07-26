import { Component } from '@angular/core';
import { AppService } from './app.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [AppService]
})
export class AppComponent {
  title = 'Optum';
  submitted = false;
  /*data: any = []*/
  author = {
    StudentName: '',
    Email: '',
    PhoneNumber: '',
    ClassId: ''
  }
  constructor(public appService: AppService) {}

  /*ngOnInit() {
    this.submitAuth(this.data);
  }*/
  onSubmit() {
      console.log("Form Submitted!");
    this.submitAuth(this.author);
  }
  submitAuth(author) {
    console.log(author);
    try {
      /*let author = {
        StudentName: formValues.StudentName,
        Email: formValues.Email,
        PhoneNumber: formValues.PhoneNumber,
        ClassId: formValues.ClassId
      }*/
      // console.log(author,"author")
      this.appService.submitAuthor(author)
        .subscribe(resp => {
            console.log(resp, "res");
           /* this.author = resp;*/
          },
          error => {
            console.log(error, "error");
          });
    } catch (e) {
      console.log(e);
    }
  }
}

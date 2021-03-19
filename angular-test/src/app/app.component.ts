import { Component } from '@angular/core';
import { UserService } from './user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-test';
  
  constructor(private service:UserService){

  }
  getUsers(){
    return this.service.getAllUsers();
    // return [
    //   {
    //     id: 1,
    //     name: 'User1'
    //   }
    // ]
  }
}

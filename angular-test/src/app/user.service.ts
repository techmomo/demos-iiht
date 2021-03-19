import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { }

  getAllUsers():any[]{
    return [
      {
        id: 1,
        name: 'User1'
      }
    ]
  }
}

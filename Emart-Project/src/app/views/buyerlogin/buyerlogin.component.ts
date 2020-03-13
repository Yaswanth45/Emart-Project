import { Component, OnInit } from '@angular/core';
import { Signup } from 'src/app/model/signup';
import { Register } from 'src/app/model/register';
import { RegisterService } from 'src/app/service/register.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-buyerlogin',
  templateUrl: './buyerlogin.component.html',
  styleUrls: ['./buyerlogin.component.css']
})
export class BuyerloginComponent implements OnInit {

  signup = new Signup(0, "", "", "");

  user: Register;
  msg: string;
  isNew: boolean;
  constructor(private loginService: RegisterService,
    private actRoute: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {
    let userId = this.actRoute.snapshot.params.id;
    if (userId) {
      this.isNew = false;
      this.loginService.getById(userId).subscribe(
        (data) => {
          this.user = data;
        }
      );

    } else {
      this.isNew = true;
      this.user = {
        userId: 0,
        userName: '',
        password: '',
        role: ''
      };
    }
  }
  signIn() {
    if (localStorage) {
      var name = (<HTMLInputElement>document.getElementById("userName")).value;
      localStorage.setItem("userId", name);
      var id = localStorage.getItem("userId");
      this.router.navigateByUrl("/home");
    }
  }
}

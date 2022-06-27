import { Component, Inject, OnInit, ViewChild } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { MatTableDataSource } from '@angular/material/table';
import { ModalComponent } from 'src/app/modal/modal.component';
import { ServiceapiService } from 'src/app/serviceapi.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-client-detail',
  templateUrl: './client-detail.component.html',
  styleUrls: ['./client-detail.component.css']
})

export class ClientDetailComponent implements OnInit {

  constructor(@Inject(MAT_DIALOG_DATA) public viewUser: any) { }

  the_cc = "";
  the_name = "";
  the_last_name = "";
  the_email = "";
  the_cell_phone = "";
  the_birthday = "";
  the_address = "";
  the_tipy_contract = "";
  the_origen = "";

  ngOnInit(): void {
    //this.getUsers();
    console.log(this.viewUser.name);

    //Campos para ser pasados a la template
    if(this.viewUser){
      this.the_cc = this.viewUser.cc;
      this.the_name = this.viewUser.name;
      this.the_last_name = this.viewUser.last_name;
      this.the_email = this.viewUser.email;
      this.the_cell_phone = this.viewUser.cell_phone;
      this.the_birthday = this.viewUser.birthday;
      this.the_address = this.viewUser.address;
      this.the_tipy_contract = this.viewUser.tipy_contract;
      this.the_origen = this.viewUser.origen;
    }
  }

}

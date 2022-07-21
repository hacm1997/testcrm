import { Component, OnInit, Inject } from '@angular/core';
import { ServiceapiService } from 'src/app/serviceapi.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent implements OnInit {

  constructor(private formbuilder : FormBuilder, private dialoref:MatDialogRef<ModalComponent>, 
    @Inject(MAT_DIALOG_DATA) public editUser: any, private restapi : ServiceapiService) { }

  clientForm !: FormGroup;

  //For Edit user/client
  ngOnInit(): void {
    console.log(this.editUser);
      this.clientForm = this.formbuilder.group({
        cc : ['', Validators.required],
        name : ['', Validators.required],
        last_name : ['', Validators.required],
        email : ['', Validators.required],
        cell_phone : ['', Validators.required],
        address : ['', Validators.required],
        tipy_contract : ['', Validators.required],
        origen : ['', Validators.required],
      });
 
      if(this.editUser){
        this.clientForm.controls['cc'].setValue(this.editUser.cc)
        this.clientForm.controls['name'].setValue(this.editUser.name)
        this.clientForm.controls['last_name'].setValue(this.editUser.last_name)
        this.clientForm.controls['email'].setValue(this.editUser.email)
        this.clientForm.controls['cell_phone'].setValue(this.editUser.cell_phone)
        this.clientForm.controls['address'].setValue(this.editUser.address)
        this.clientForm.controls['tipy_contract'].setValue(this.editUser.tipy_contract)
        this.clientForm.controls['origen'].setValue(this.editUser.origen)
      }
  }
  editUserc(){
    this.restapi.updateUser(this.clientForm.value, this.editUser.id).subscribe({
      next:(res)=>{
        alert(" ¡Update Success! ")
        this.clientForm.reset()
        this.dialoref.close('update')
      },
      error:()=>{
        alert(" ¡Update Error! ")
      }
    })
  }

}

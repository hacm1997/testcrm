import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { MatDialog, MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ModalComponent } from 'src/app/modal/modal.component';
import { ServiceapiService } from 'src/app/serviceapi.service';

@Component({
  selector: 'app-clients-add',
  templateUrl: './clients-add.component.html',
  styleUrls: ['./clients-add.component.css']
})
export class ClientsAddComponent implements OnInit {

  emailFormControl = new FormControl('', [Validators.required, Validators.email]);
  userForm !: FormGroup;

  constructor(private formbuilder : FormBuilder, private restapi : ServiceapiService, private dialoref:MatDialogRef<ModalComponent>) { }
  
  Type:any=[];

  ngOnInit(): void {

    this.restapi.getType().subscribe(
      (TypeC)=>{
        this.Type=TypeC
      }
    )

    this.userForm = this.formbuilder.group({
      cc : ['', Validators.required],
      name : ['', Validators.required],
      last_name : ['', Validators.required],
      email : ['', Validators.required],
      cell_phone : ['', Validators.required],
      address : ['', Validators.required],
      birthday : ['', Validators.required],
      tipy_contract : ['', Validators.required],
      origen : ['', Validators.required]   

    })
    
  }
  
  addUserC(){

    if(this.userForm.valid){
      this.restapi.addUser(this.userForm.value)
      .subscribe({
        next:(res)=>{
          alert("¡Success User add!")
          this.userForm.reset()
          this.dialoref.close('update')
        },
        error:()=>{
          alert("¡Error Not User add! ")
        }
      })
    }
  }

}

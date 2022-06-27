import { Component, Inject, OnInit, ViewChild } from '@angular/core';
import { MatDialog, MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { ClientDetailComponent } from 'src/app/client-detail/client-detail.component';
import { ModalComponent } from 'src/app/modal/modal.component';
import { ServiceapiService } from 'src/app/serviceapi.service';
import { ClientsAddComponent } from '../clients-add/clients-add.component';

@Component({
  selector: 'app-clients-show',
  templateUrl: './clients-show.component.html',
  styleUrls: ['./clients-show.component.css']
})
export class ClientsShowComponent implements OnInit {

  title = "ALL CLIENTS VIEW"

  @ViewChild(MatPaginator) paginator!:MatPaginator;

  constructor(private _consumerservice:ServiceapiService, private modal: MatDialog) { }

  usersC:any=[];
  displayFileds: string[] = ['name', 'last_name', 'email', 'cell_phone', 'address', 'tipy_contract', 'origen', 'action'];
  dataSource: MatTableDataSource<any>=new MatTableDataSource<any>();

  ngOnInit(): void {
    this.getUsers();
  }
  getUsers(){
    this._consumerservice.getListUser().subscribe(
      (UserData)=>{
        this.usersC=UserData
        this.dataSource = new MatTableDataSource<any>(this.usersC);
        this.dataSource.paginator = this.paginator;
      }
    )
  }

  //Función para editar usuario/cliente
  editUsers(element : any){
    this.modal.open(ModalComponent,{
      width: '40%',
      data:element
    }).afterClosed().subscribe(val=>{
      if(val === 'update'){
        this.getUsers();
      }
    });
  }

  //función para agregar nuevos usuario/cliente
  addUsers(){
    this.modal.open(ClientsAddComponent,{
      width: '40%',
    }).afterClosed().subscribe(val=>{
      if(val === 'update'){
        this.getUsers();
      }
    });
  }

  //Función para mostrar detalles de usuario/cliente
  detailsUsers(element : any){
    //console.log(element);
    this.modal.open(ClientDetailComponent,{
      width: '40%',
      data:element
    });
  }

  //Función para borrar usuario/cliente
  deleteUser(id:number){
    this._consumerservice.deleteUsers(id).subscribe({
      next:(res)=>{
        alert(" ¡Success delete user/client! ");
        this.getUsers();
      },
      error:()=>{
        alert(" ¡Error, user/client not deleted! ");
      }
    })
  }

}

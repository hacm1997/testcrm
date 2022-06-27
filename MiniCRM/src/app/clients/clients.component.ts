import { Component, OnInit } from '@angular/core';
import { ServiceapiService } from '../serviceapi.service';
import { MatTableDataSource } from '@angular/material/table';

@Component({
  selector: 'app-client',
  templateUrl: './clientS.component.html',
  styleUrls: ['./clientS.component.css']
})
export class ClientComponent implements OnInit {

  constructor(private _consumerservice:ServiceapiService) { }
  usersC:any=[];
  displayFileds: string[] = ['name', 'last_name', 'email', 'cell_phone', 'address','type', 'tipy_contract', 'origen', 'action'];
  dataSource: MatTableDataSource<any>=new MatTableDataSource<any>();

  ngOnInit(): void {
    this._consumerservice.getListUser().subscribe(
      (UserData)=>{
        this.usersC=UserData
        this.dataSource = new MatTableDataSource<any>(this.usersC);
      }
    )
  }

}

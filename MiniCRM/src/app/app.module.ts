import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ClientComponent } from './clients/clients.component';
import { ClientsAddComponent } from './clients/clients-add/clients-add.component';
import { ClientsShowComponent } from './clients/clients-show/clients-show.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { MatIconModule } from '@angular/material/icon';
import { MatPaginatorModule } from '@angular/material/paginator';
import { ServiceapiService } from './serviceapi.service';
import { MatTableModule } from '@angular/material/table';
import { ModalComponent } from './modal/modal.component';
import { MatCardModule } from '@angular/material/card';
import { MatFormFieldModule } from '@angular/material/form-field';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {MatDatepickerModule} from '@angular/material/datepicker';
import { MatDialogModule } from '@angular/material/dialog';
import { MatNativeDateModule } from '@angular/material/core';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { ClientDetailComponent } from './client-detail/client-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    ClientsAddComponent,
    ClientComponent,
    ClientsShowComponent,
    ModalComponent,
    ClientDetailComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatIconModule,
    MatTableModule,
    MatPaginatorModule,
    MatCardModule,
    MatFormFieldModule,
    FormsModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatInputModule,
    MatDialogModule,
    MatButtonModule
  ],
  providers: [ServiceapiService],
  bootstrap: [AppComponent]
})
export class AppModule { }

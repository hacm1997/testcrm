import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClientsAddComponent } from './clients/clients-add/clients-add.component';
import { ClientsShowComponent } from './clients/clients-show/clients-show.component';

const routes: Routes = [
  {path: 'clients', component: ClientsShowComponent},
  {path: 'addUser', component:ClientsAddComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

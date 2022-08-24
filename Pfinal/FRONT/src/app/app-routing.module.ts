import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NeweducacionComponent } from './components/educacion/neweducacion.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { EditeducacionComponent } from './components/educacion/editeducacion.component';
import { NewproyectoComponent } from './components/proyecto/newproyecto.component';
import { EditproyectoComponent } from './components/proyecto/editproyecto.component';
import { NewskillsComponent } from './components/skills/newskills.component';
import { EditskillsComponent } from './components/skills/editskills.component';

const routes: Routes = [
  {path:'', component: HomeComponent},
  {path:'login', component: LoginComponent},
  {path: 'nuevaexp', component: NewExperienciaComponent},
  {path: 'editexp/:id', component: EditExperienciaComponent},
  {path: 'nuevaedu', component: NeweducacionComponent},
  {path: 'editedu/:id', component: EditeducacionComponent},
  {path: 'nuevoproy', component: NewproyectoComponent},
  {path: 'editproy/:id', component: EditproyectoComponent},
  {path: 'nuevaskills', component: NewskillsComponent},
  {path: 'editskills/:id', component: EditskillsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

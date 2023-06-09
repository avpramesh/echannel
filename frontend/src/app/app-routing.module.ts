import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EventListComponent } from './components/event-list/event-list.component';
import { EventDetailsComponent } from './components/event-details/event-details.component';
import { AddEventsComponent } from './components/add-events/add-events.component';

const routes: Routes = [
  { path: '', redirectTo: 'echannels', pathMatch: 'full' },
  { path: 'echannels', component:EventListComponent },
  { path: 'echannels/:id', component:EventDetailsComponent },
  { path: 'eventdata', component:AddEventsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
import { Component, Input } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Eventsource } from 'src/app/models/eventsource.model';
import { EventSource } from 'src/app/services/eventsource.service';

@Component({
  selector: 'app-event-details',
  templateUrl: './event-details.component.html',
  styleUrls: ['./event-details.component.css']
})
export class EventDetailsComponent {
  public get eventSourceService(): EventSource {
    return this.eventSourceService;
  }
  public set eventSourceService(value: EventSource) {
    this.eventSourceService = value;
  }

  @Input() viewMode = false;

  @Input() currentTutorial: Eventsource = {
    
      business_key: '',
      priority: '',
      source_bu: '',
      account_name: '',
      transaction_amount:0,
      transaction_currency: '',
      locked_by: '',
      debit_account_number: '',
      account_currency: '',
      beneficiary_name: '',
      contact_person: '',
      cust_info_mkr: '',
      account_info_mkr: '',
      customer_called_on: '',
      created_by: '',
      updated_by: '',
      outcome: '',
      extension: '',
      comment: '',
      updated_on: new Date,
      created_on: new Date,
      dcp_reference: '',
      status: 'unassigned'
  };
  
  message = '';

  constructor(
    private _tutorialService: EventSource,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    if (!this.viewMode) {
      this.message = '';
      this.getTutorial(this.route.snapshot.params["id"]);
    }
  }

  getTutorial(id: string): void {
    this.eventSourceService.get(id)
      .subscribe({
        next: (data) => {
          this.currentTutorial = data;
          console.log(data);
        },
        error: (e) => console.error(e)
      });
  }

  updatePublished(status: string): void {
    const data = {
      business_key: this.currentTutorial.business_key,
      priority: this.currentTutorial.priority,
      status: status
    };

    this.message = '';

    this.eventSourceService.update(this.currentTutorial.id, data)
      .subscribe({
        next: (res) => {
          console.log(res);
          this.currentTutorial.status = status;
          this.message = res.message ? res.message : 'The status was updated successfully!';
        },
        error: (e) => console.error(e)
      });
  }

  updateTutorial(): void {
    this.message = '';

    this.eventSourceService.update(this.currentTutorial.id, this.currentTutorial)
      .subscribe({
        next: (res) => {
          console.log(res);
          this.message = res.message ? res.message : 'This tutorial was updated successfully!';
        },
        error: (e) => console.error(e)
      });
  }

  deleteTutorial(): void {
    this.eventSourceService.delete(this.currentTutorial.id)
      .subscribe({
        next: (res) => {
          console.log(res);
          this.router.navigate(['/tutorials']);
        },
        error: (e) => console.error(e)
      });
  }


}

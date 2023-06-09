import { Component } from '@angular/core';
import { Eventsource } from 'src/app/models/eventsource.model';
import { EventSource } from 'src/app/services/eventsource.service';

@Component({
  selector: 'app-add-events',
  templateUrl: './add-events.component.html',
  styleUrls: ['./add-events.component.css']
})
export class AddEventsComponent {
  eventsource: Eventsource = {
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
  submitted = false;

  constructor(private eventSourceService: EventSource) { }

  saveEventSource(): void {
    const data = {
      business_key: this.eventsource.business_key,
      priority: this.eventsource.priority,
    };

    this.eventSourceService.create(data)
      .subscribe({
        next: (res) => {
          console.log(res);
          this.submitted = true;
        },
        error: (e) => console.error(e)
      });
  }

  newEventSource(): void {
    this.submitted = false;
    this.eventsource = {
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
  }


}

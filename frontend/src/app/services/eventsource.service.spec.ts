import { Eventsource } from './eventsource.service';

import { TestBed } from '@angular/core/testing';

describe('Eventsource', () => {
  let service: Eventsource;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Eventsource);
  });
  it('should create an instance', () => {
    expect(new Eventsource()).toBeTruthy();
  });
});

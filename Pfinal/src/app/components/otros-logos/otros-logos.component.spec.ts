import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OtrosLogosComponent } from './otros-logos.component';

describe('OtrosLogosComponent', () => {
  let component: OtrosLogosComponent;
  let fixture: ComponentFixture<OtrosLogosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OtrosLogosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OtrosLogosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

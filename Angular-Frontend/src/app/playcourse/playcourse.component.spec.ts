import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PlaycourseComponent } from './playcourse.component';

describe('PlaycourseComponent', () => {
  let component: PlaycourseComponent;
  let fixture: ComponentFixture<PlaycourseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PlaycourseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PlaycourseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

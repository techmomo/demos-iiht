import { ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {
  let fixture: ComponentFixture<AppComponent>;
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        AppComponent
      ],
    }).compileComponents();

     fixture = TestBed.createComponent(AppComponent); // this creates the test instance for us 
  });

  // beforeAll(()=>{
  //   // will get called only once at the start of suite
  // });

  // afterAll(()=>{
  //   // will get called only once at the end of suite
  // });
  
  // beforeEach(()=>{
  //   console.log('before each....');
  // });

  // afterEach(()=>{
  //   console.log('after each....');
  // })

  // it('should start tests properly ',()=>{
  //   expect('Hello').toBe('Hello');
  // });

  // it('should not start tests properly ',()=>{
  //   expect('Hello!').not.toBe('Hello');
  // });



  it('should create the app', () => {
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'angular-test'`, () => {
    const app = fixture.componentInstance;
    expect(app.title).toEqual('angular-test');
  });

  it('should get all the Users ',()=>{
    const users = fixture.componentInstance.getUsers();
    expect(users[0].id).toBe(1);
    expect(users[0].name).toBe('User1');
  })

  it('should render div with Hello in it ',()=>{
    fixture.detectChanges(); // track all the new changes
    const element = fixture.debugElement; // gives us the access to html tags in the template file 
    const divElem:HTMLElement = element.query(By.css('.dv')).nativeElement;
    expect(divElem.textContent).toContain('hello');
  });

  it('should render span with Karma / Jasmine in it  ',()=>{
    fixture.detectChanges(); // track all the new changes
    const element = fixture.debugElement; // gives us the access to html tags in the template file 
    const divElem:HTMLElement = element.query(By.css('#one')).nativeElement;
    expect(divElem.textContent).toContain('Karma');
  });
});

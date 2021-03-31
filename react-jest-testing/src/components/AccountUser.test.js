import { cleanup, fireEvent, render } from '@testing-library/react';
import React from 'react';
import AccountUser from './AccountUser';

// DOM based Testing
// mount & unmount the component
afterEach(cleanup);

it('Account User is enabled or not ',()=> {
    const component = render(<AccountUser user="user" accountUser="accountUser" />,);
    expect(component.queryByText(/accountuser/i)).toBeTruthy();
    fireEvent.click(component.getByText(/user/i));
    expect(component.queryByText(/accountuser/i)).toBeTruthy();

    // fireEvent.click(getByLabelText(/user/i));
    // expect(queryByLabelText(/accountUser/i)).toBeTruthy();
});
import com.prototype.action.Action
import com.prototype.json.CustomObjectMarshallers
import com.prototype.user.Role
import com.prototype.user.AppUser
import com.prototype.user.UserRole
import com.stripe.Stripe

class BootStrap {

    def init = {
        servletContext ->
            CustomObjectMarshallers.init()
            Stripe.apiKey = 'sk_test_BQokikJOvBiI2HlWgH4olfQ2'

            if(System.env.DATABASE_URL == null) {
                new Action(id: 1, name: 'Action 1', dateCreated: Date.parse('MM/dd/yyyy', '02/23/2015'), dueDate: Date.parse('MM/dd/yyyy', '08/13/2015')).save()
                new Action(id: 2, name: 'Action 2', dateCreated: Date.parse('MM/dd/yyyy', '08/14/2012'), dueDate: Date.parse('MM/dd/yyyy', '04/19/2019')).save()
                new Action(id: 3, name: 'Action 3', dateCreated: Date.parse('MM/dd/yyyy', '08/16/2014'), dueDate: Date.parse('MM/dd/yyyy', '01/15/2016')).save()
                new Action(id: 4, name: 'Action 4', dateCreated: Date.parse('MM/dd/yyyy', '06/14/2011'), dueDate: Date.parse('MM/dd/yyyy', '06/14/2016')).save()
                new Action(id: 5, name: 'Action 5', dateCreated: Date.parse('MM/dd/yyyy', '02/15/2009'), dueDate: Date.parse('MM/dd/yyyy', '02/20/2020')).save()
                new Action(id: 6, name: 'Action 6', dateCreated: Date.parse('MM/dd/yyyy', '11/18/2002'), dueDate: Date.parse('MM/dd/yyyy', '08/16/2017')).save()
                new Action(id: 7, name: 'Action 7', dateCreated: Date.parse('MM/dd/yyyy', '04/19/2004'), dueDate: Date.parse('MM/dd/yyyy', '08/16/2017')).save()
                new Action(id: 8, name: 'Action 8', dateCreated: Date.parse('MM/dd/yyyy', '06/20/2012'), dueDate: Date.parse('MM/dd/yyyy', '03/06/2019')).save()
                new Action(id: 9, name: 'Action 9', dateCreated: Date.parse('MM/dd/yyyy', '09/24/2007'), dueDate: Date.parse('MM/dd/yyyy', '08/14/2016')).save()
                new Action(id: 10, name: 'Action 10', dateCreated: Date.parse('MM/dd/yyyy', '08/28/2015'), dueDate: Date.parse('MM/dd/yyyy', '10/31/2016')).save()
                new Action(id: 11, name: 'Action 11', dateCreated: Date.parse('MM/dd/yyyy', '02/20/2006'), dueDate: Date.parse('MM/dd/yyyy', '05/02/2022')).save()
                new Action(id: 12, name: 'Action 12', dateCreated: Date.parse('MM/dd/yyyy', '01/15/2014'), dueDate: Date.parse('MM/dd/yyyy', '06/10/2021')).save()
                new Action(id: 13, name: 'Action 13', dateCreated: Date.parse('MM/dd/yyyy', '10/31/2007'), dueDate: Date.parse('MM/dd/yyyy', '10/31/2018')).save()
                new Action(id: 14, name: 'Action 14', dateCreated: Date.parse('MM/dd/yyyy', '11/15/2012'), dueDate: Date.parse('MM/dd/yyyy', '12/31/2019')).save()
                new Action(id: 15, name: 'Action 15', dateCreated: Date.parse('MM/dd/yyyy', '12/04/2015'), dueDate: Date.parse('MM/dd/yyyy', '06/20/2020')).save()
                new Action(id: 16, name: 'Action 16', dateCreated: Date.parse('MM/dd/yyyy', '03/06/2009'), dueDate: Date.parse('MM/dd/yyyy', '06/14/2017')).save()
                new Action(id: 17, name: 'Action 17', dateCreated: Date.parse('MM/dd/yyyy', '05/02/2008'), dueDate: Date.parse('MM/dd/yyyy', '11/09/2016')).save()
                new Action(id: 18, name: 'Action 18', dateCreated: Date.parse('MM/dd/yyyy', '06/06/2013'), dueDate: Date.parse('MM/dd/yyyy', '06/10/2028')).save()
                new Action(id: 19, name: 'Action 19', dateCreated: Date.parse('MM/dd/yyyy', '11/09/2006'), dueDate: Date.parse('MM/dd/yyyy', '08/16/2024')).save()
                new Action(id: 20, name: 'Action 20', dateCreated: Date.parse('MM/dd/yyyy', '06/10/2008'), dueDate: Date.parse('MM/dd/yyyy', '09/24/2027')).save()

                new Role('ROLE_ADMIN').save()
                def userRole = new Role('ROLE_USER').save()

                def testUser = new AppUser(username: 'omar.ortiz', firstName: 'Omar', lastName: 'Ortiz', password: '123456', email: 'omar.ortiz@test.com',
                        birthDate: Date.parse('MM/dd/yyyy', '11/23/1990')).save()
                UserRole.create(testUser, userRole)
            }
    }

    def destroy = {
    }
}

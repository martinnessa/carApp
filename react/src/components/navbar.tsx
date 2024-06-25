export function Navbar ()  {
    return <>
        <div className="bg-gray-500 grid grid-cols-2 h-12">
            <div className="col-span-1">
                <p className="text-left pt-2.5 pl-2.5">CarApp</p>
            </div>
            <div className="col-span-1">
                <p className="text-right pt-2.5 pr-2.5">Account Settings</p>
            </div>
        </div>
    </>
}